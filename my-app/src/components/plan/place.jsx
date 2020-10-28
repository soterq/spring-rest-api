import React, {Component} from 'react';

class Place extends Component {

    render() {
        return (
            <React.Fragment>
                <div className="container">
                    <input placeholder="Enter name Here ..." className="form-control" id="title" type="text"
                        // value={this.state.value}
                           name="title" onChange={this.handleChange}/>
                    <div className="form-group">
                        <label name="DescriptionLabel">Description</label>
                        <textarea className="form-control" name="description" onChange={this.handleChange}/>
                    </div>
                    {/*<LanguageList />*/}
                    <div className="form-group">
                        <label name="commoditiesLabel">Commodities</label>
                        <textarea className="form-control" name="commodities" onChange={this.handleChange}/>
                    </div>

                    <div className="form-group">
                        <label name="featuresLabel">Features</label>
                        <textarea className="form-control" name="features" onChange={this.handleChange}/>
                    </div>
                    <div className="form-group">
                        <input type="text" name="lastVisit"/>
                    </div>
                    <div className="form-group">
                        <input type="text" name="beThereAt"/>
                    </div>

                </div>
            </React.Fragment>
        );
    }
}

export default Place;