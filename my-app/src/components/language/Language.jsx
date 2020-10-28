import React, {Component} from 'react';

class Language extends Component {

    render() {
        return (
            <div className="container">
                <div className="form-group dropdown">
                    <div className="container ">
                        <select id="languages" className="btn btn-info dropdown-toggle" name="severity">
                            onChange={this.handleChange}>
                            <option value="ROMANA">Romana</option>
                            <option value="ENGLEZA">Engleza</option>
                            <option value="RUSA">Rusa</option>
                            <option value="IATLIANA">Italiana</option>
                            <option value="GERMANA">Franceza</option>
                            <option value="FRANCEZA">Engleza</option>
                            <option value="SPANIOLA">Spaniola</option>
                            <option value="URCAINEANA">Ucraineana</option>
                            <option value="GAGAUZA">Gagauza</option>
                        </select>

                        <button
                            onClick={() => this.props.onDelete(this.props.language.id)}
                            className="btn btn-danger btn-sm m-2">delete
                        </button>
                    </div>
                </div>

            </div>

        );
    }
}

export default Language;