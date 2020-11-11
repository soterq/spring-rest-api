import React, {Component} from 'react';
import NavBar from './components/navbar';
import './App.css';
import {
    BrowserRouter as Router,
    Switch,
    Route,
} from "react-router-dom";
import TaskList from './components/taskList'
import Spender from './components/spender'
import Program from './components/counter/program'
import TaskForm from './components/taskForm'
import PotsTest from './components/postTest'
import Plan from './components/plan/plan'
import Place from './components/plan/place'
import LanguageProgram from './components/language/LanguageProgram'


class App extends Component {
    render() {
        return (
            // <React.Fragment>
            <Router>
                <NavBar /*totalCounters = {this.state.counters.filter(c => c.value >0).length}*/
                />
                <Switch>
                    <Route path="/program" component={Program}/>
                    <Route path="/tasklist" component={TaskList}/>
                    <Route path="/spender" component={Spender}/>
                    <Route path="/taskForm" component={TaskForm}/>
                    <Route path="/postTest" component={PotsTest}/>
                    <Route path="/planForm" component={Plan}/>
                    <Route path="/language" component={LanguageProgram}/>
                    <Route path="/placeForm" component={Place}/>
                </Switch>
            </Router>

            // {/* </React.Fragment> */
        );
    }
}

export default App;
