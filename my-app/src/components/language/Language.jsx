import React, {Component} from 'react';
import MenuItem from '@material-ui/core/MenuItem';
import FormControl from '@material-ui/core/FormControl';
import Select from '@material-ui/core/Select';
class Language extends Component {

    render() {
        return (
            <div className="container">
                <div className="form-group dropdown">
                    <div className="container ">
                        <FormControl className="w-25">
                            <Select defaultValue="" id="grouped-select"  onChange={this.handleChange}  name="spokenLanguage">
                                <MenuItem value="ROMANA">Romana</MenuItem>
                                <MenuItem value="ENGLEZA">Engleza</MenuItem>
                                <MenuItem value="RUSA">Rusa</MenuItem>
                                <MenuItem value="IATLIANA">Italiana</MenuItem>
                                <MenuItem value="GERMANA">Germana</MenuItem>
                                <MenuItem value="FRANCEZA">Franceza</MenuItem>
                                <MenuItem value="SPANIOLA">Spaniola</MenuItem>
                                <MenuItem value="URCAINEANA">Ucraineana</MenuItem>
                                <MenuItem value="GAGAUZA">Gagauza</MenuItem>
                            </Select>
                        </FormControl>

                        <button
                            onClick={() => this.props.onDelete(this.props.language.id)}
                            className="btn btn-danger btn-sm m-2">Delete
                        </button>
                    </div>
                </div>

            </div>

        );
    }
}

export default Language;