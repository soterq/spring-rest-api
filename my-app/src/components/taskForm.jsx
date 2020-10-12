import React from 'react';

class TaskForm
    extends React.Component {
    constructor() {
        super();
        this.state = {
            title: '',
            description: '',
            severity: ''
        };
    }

    componentDidMount() {
        this.setState({severity: 0})
    }

    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value});
    }

    handleSubmit = (event) => {
        const basePath = 'http://localhost:8080/api/v1/tasks';
        console.log(this.state)

        fetch(basePath, {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(this.state),
        }).then(function (response) {
            return response;
        })
        event.preventDefault();
    }

    render() {
        return (<div className="container">
            <form autoComplete="nope" onSubmit={this.handleSubmit}>
                <div className="form-group">
                    <label name="titleField">Title</label>
                    <input className="form-control" id="title" type="text" value={this.state.value} name="title"
                           onChange={this.handleChange}/>
                </div>
                <div className="form-group">
                    <div className="container"/>
                    <label>Severity</label>
                    <select id="severitylevel" className="severity-Block" name="severity" onChange={this.handleChange}>
                        <option value="0">Low</option>
                        <option value="1">Medium</option>
                        <option value="2">High</option>
                    </select>
                </div>
                <div className="form-group">
                    <label name="DescriptionLabel">Description</label>
                    <textarea className="form-control" name="description" onChange={this.handleChange}/>
                </div>
                <button type="submit" className="btn btn-primary">Submit</button>
            </form>
        </div>);
    }
}

export default TaskForm;