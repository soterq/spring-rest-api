import React, {Component} from 'react';

class PostTest extends Component {
    constructor() {
        super();
        this.state = {
            name: '',
            surname: ''
        };
    }

    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value});
    }

    handleSubmit = (event) => {
        const basePath = 'http://localhost:8080/api/v1/customers/test';

        fetch(basePath, {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(this.state)
        }).then(function (response) {
            console.log(response)
            return response;
        })
        event.preventDefault();
    }

    render() {
        return (<React.Fragment>
                <div className="container">
                    <form autoComplete="nope" onSubmit={this.handleSubmit}>
                        <div className="form-group">
                            <label name="titleField">Title</label>
                            <input className="form-control" id="title" type="text" value={this.state.value} name="name"
                                   onChange={this.handleChange}/>
                            <input className="form-control" id="title" type="text" value={this.state.value}
                                   name="surname" onChange={this.handleChange}/>
                        </div>
                        <button type="submit" className="btn btn-primary">Submit</button>
                    </form>
                </div>
            </React.Fragment>
        );
    }
}

export default PostTest;