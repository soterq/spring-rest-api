import React, {Component} from 'react';
import Counters from './counters';

class Program extends Component {
    state = {
        counters: [
            {id: 1, value: 4},
            {id: 2, value: 0},
            {id: 3, value: 0},
            {id: 4, value: 0},
        ]
    };

    handleIncrement = counter => {
        const newCounters = [...this.state.counters];
        const index = newCounters.indexOf(counter);
        newCounters[index] = {...counter};
        newCounters[index].value++;
        this.setState({counters: [...newCounters]});
    }

    handleReset = () => {
        const newCounters = this.state.counters.map(c => {
            c.value = 0;
            return c;
        })
        this.setState({...newCounters});
    }

    handleDelete = counterId => {
        const newCounters = this.state.counters.filter(c => c.id !== counterId);
        // this.state.counters = counters;
        this.setState({counters: [...newCounters]});
    }

    handleAdd = () => {
        const newCounters = [...this.state.counters, {id: this.state.counters.length + 1, value: 0}]
        this.setState({counters: [...newCounters]});
    }

    render() {
        return (
            <React.Fragment>
                <main className="container">
                    <Counters
                        counters={this.state.counters}
                        onReset={this.handleReset}
                        onIncrement={this.handleIncrement}
                        onDelete={this.handleDelete}
                        onAdd={this.handleAdd}
                    />
                </main>
            </React.Fragment>
        );
    }
}

export default Program;