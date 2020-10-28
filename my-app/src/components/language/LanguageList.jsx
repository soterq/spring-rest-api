import React, {Component} from "react";
import Language from "./Language";

class LanguageList extends Component {
    render() {
        const {languages, onDelete, onAdd} = this.props;
        return (
        <div>
            <label>Languages</label>
            {languages.map(language => (
                <Language
                    key={language.id}
                    onDelete={onDelete}
                    language={language}
                />
            ))}

            <button
                onClick={onAdd}
                className="btn btn-success btn-sm m-2">Add
            </button>
        </div>
    );
    }
}

export default LanguageList;