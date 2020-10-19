import React, {Component} from 'react';

class TaskHome extends Component {
    state = {
        id: '',
        title: '',
        description: '',
        creationDate: '',
        severity: ''
    }

    onTaskLoad(id) {
        fetch('http://localhost:8080/api/v1/tasks/ ' + id)
            .then(res => res.json())
            .then((data) => {
                this.setState({id: data.id,
                    title:data.title,
                    description: data.description,
                    creationDate: data.creationDate,
                    severity : data.severity
                })
            })
            .catch(console.log)
    }
    render() {

        return (<div>

        </div>);
    }
}

export default TaskHome;