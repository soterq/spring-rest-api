import React, {Component} from 'react';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import LanguageList from "../language/LanguageList";


class Place extends Component {
    constructor() {
        super();
        this.state = {
            name: "",
            description: "",
            spokenLanguage: [],
            commodities: "",
            features: "",
            lastVisit: "",
            beThereAt: ""
        };
    }

    handleDelete = languageId => {
        const newLanguages = this.state.spokenLanguage.filter(l => l.id !== languageId);
        this.setState({spokenLanguage: [...newLanguages]});
    }

    handleAdd = () => {
        const newLanguages = [...this.state.spokenLanguage, {
            id: this.state.spokenLanguage.length + 1,
            value: "Romanian"
        }]
        this.setState({spokenLanguage: [...newLanguages]});
    }
    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value});
    }

    handleSubmit = (event) => {
        event.preventDefault();
        const basePath = 'http://localhost:8080/api';
        // const basePath = 'http://localhost:8080/api/v1/plans';
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
    }

    render() {

        return (
            <React.Fragment>
                <form autoComplete="off" onSubmit={this.handleSubmit}>
                    <div className="container">
                        <div className="margin-top">
                            <TextField id="standard-basic"
                                       label="Name"
                                       className="w-100"
                                       name="name"
                                       onChange={this.handleChange}/>
                        </div>
                        <div className="margin-top">
                            <TextField
                                id="standard-multiline-static"
                                label="Description"
                                className="w-100"
                                name="description"
                                multiline
                                rows={4}
                                onChange={this.handleChange}
                            />
                        </div>
                        <div className="margin-top">
                            <LanguageList
                                languages={this.state.spokenLanguage}
                                onDelete={this.handleDelete}
                                onAdd={this.handleAdd}
                            />
                        </div>
                        <div className="margin-top">
                            <TextField
                                id="standard-multiline-static"
                                label="Commodities"
                                name="commodities"
                                className="w-100"
                                multiline
                                rows={4}
                                onChange={this.handleChange}
                            />
                        </div>
                        <div className="margin-top">
                            <TextField
                                id="standard-multiline-static"
                                label="Features"
                                className="w-100"
                                name="features"
                                multiline
                                rows={4}
                                onChange={this.handleChange}
                            />
                        </div>
                        <div className="margin-top">
                            <TextField
                                id="time"
                                label="Be there at"
                                type="time"
                                defaultValue="07:30"
                                name="beThereAt"
                                InputLabelProps={{
                                    shrink: true,
                                }}
                                inputProps={{
                                    step: 300, // 5 min
                                }}
                                onChange={this.handleChange}
                            />
                            <TextField
                                className="margin-left"
                                id="date"
                                label="Last time visited"
                                type="date"
                                defaultValue="2017-05-24"
                                name="lastVisit"
                                InputLabelProps={{
                                    shrink: true,
                                }}
                                onChange={this.handleChange}
                            />

                        </div>
                        <div className="margin-top">
                            <Button
                                variant="contained"
                                color="primary"
                                size="large"
                                type="submit"
                                onSubmit={this.handleSubmit}
                            >
                                Submit
                            </Button>
                        </div>
                    </div>
                </form>
            </React.Fragment>
        );
    }
}

export default Place;