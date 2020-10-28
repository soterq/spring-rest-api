import React, {Component} from 'react';
import {Nav} from "react-bootstrap";

class TaskList
    extends Component {

    state = {
        tasks: []
    };


    componentDidMount() {
        fetch('http://localhost:8080/api/v1/tasks')
            .then(res => res.json())
            .then((data) => {
                this.setState({tasks: data})
            })
            .catch(console.log)

    }

    onDelete(id) {
        fetch('http://localhost:8080/api/v1/tasks/' + id, {
            method: 'DELETE',
        })
            .then(() => {
                const updatedState = this.state.tasks.filter(item => item.id !== id);
                console.log(updatedState)
                this.setState({tasks: updatedState});
            })

    }

    render() {
        return (
            <React.Fragment>
                <div>
                    <button>Add new task</button>
                    <div className={"container"}>
                        <h1 align="center">Task List</h1>
                        {this.state.tasks.map((task) => (
                            <div className="card text-white bg-info mb-3" style={{width: "18rem"}} key={task.id}>
                                <div className="card-body">
                                    <h5 className="card-title">
                                        <Nav.Link href="/postTest"> {task.title}</Nav.Link>
                                    </h5>
                                    <h5 className="card-subtitle mb-2 text-muted">{task.severity}</h5>
                                    {/*<p className="card-text">{task.description}</p>*/}
                                    {/*<h5 className="card-subtitle mb-2 text-muted">{task.creationDate}</h5>*/}
                                    <button className="btn btn-outline-secondary"
                                            onClick={() => this.onDelete(task.id)}>Delete
                                    </button>
                                </div>
                            </div>
                        ))}
                    </div>
                </div>
            </React.Fragment>
        );
    }
}

export default TaskList;