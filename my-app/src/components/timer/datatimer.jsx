import React, {Component} from 'react';
import { TimePicker } from 'react-md';

class DataTimer extends Component {
    render() {
        return (<div>
            <div className="md-grid">
                <TimePicker
                    id="time-picker-auto-ok"
                    placeholder="Select an appointment time"
                    className="md-cell md-cell--bottom"
                    autoOk
                />
            </div>
        </div>  );
    }
}

export default DataTimer;