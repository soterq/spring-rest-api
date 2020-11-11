import React, {Component} from 'react';
import LanguageList from "./LanguageList";

class LanguageProgram extends Component {
    state = {
        languages: []
    };

    handleDelete = languageId => {
        const newLanguages = this.state.languages.filter(l => l.id !== languageId);
        this.setState({languages: [...newLanguages]});
    }

    handleAdd = () => {
        const newLanguages = [...this.state.languages, {id: this.state.languages.length + 1, value: "English"}]
        this.setState({languages: [...newLanguages]});
    }


    render() {
        return (
            <React.Fragment>
                <main>
                    <LanguageList
                        languages={this.state.languages}
                        onDelete={this.handleDelete}
                        onAdd={this.handleAdd}
                    />
                </main>
            </React.Fragment>
        );
    }
}

export default LanguageProgram;