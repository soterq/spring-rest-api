import React, {Component} from 'react';
import Counter from './counter';

class Counters extends Component {
    render() {
        console.log(this.props)
        const {onReset, counters, onDelete, onIncrement, onAdd} = this.props;
        return (<div>
            <button onClick={onReset}
                    className="btn btn-primary btn-sm m-2">
                Reset
            </button>

            {counters.map(counter => (
                <Counter
                    key={counter.id}
                    onDelete={onDelete}
                    onIncrement={onIncrement}
                    counter={counter}
                />
            ))}
            <button
                onClick={onAdd}
                className="btn btn-success btn-sm m-2">Add
            </button>

        </div>);
    }
}

export default Counters;