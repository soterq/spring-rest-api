import React, {Component} from 'react';

class Plan extends Component {
    constructor() {
        super();
        this.state = {
            id: '',
            title: '',
            places: [
                {
                    id: 250,
                    name: "Botanic Garden",
                    description: "Amazing  park a lot of plants",
                    spokenLanguage: [
                        "",
                    ],
                    commodities: "",
                    features: "",
                    lastVisit: null,
                    beThereAt: null
                }
            ],
            languages: []
        };

    }

    handleLanguageButtonAdd = () => {
        const newLanguages = [...this.state.languages]
        this.setState({...newLanguages});
    }

    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value});
    }

    handleSubmit = (event) => {
        const basePath = 'http://localhost:8080/api/v1/plans';
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
        return (<div className="container align-self-auto p-5">
            <form autoComplete="off" onSubmit={this.handleSubmit}>
                <div className="form-group">
                    <label name="titleField">Title</label>
                    <input placeholder="Enter Title Here ..." className="form-control" id="title" type="text"
                           value={this.state.value} name="title" onChange={this.handleChange}/>
                </div>
                <button type="submit" className="btn btn-primary btn-lg">Submit</button>
            </form>
        </div>);
    }
}

export default Plan;