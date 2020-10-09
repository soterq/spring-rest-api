import React, { Component } from 'react';
import NavBar from './components/navbar';
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
} from "react-router-dom";
import TaskList from './components/taskList'
import Spender from './components/spender'
import Program from './components/program'
import TaskForm from './components/taskForm'
import PotsTest from './components/postTest'
class App extends Component {


  render() { 
    return (
      // <React.Fragment>
        <Router>
            <NavBar /*totalCounters = {this.state.counters.filter(c => c.value >0).length}*/ 
            />
              <Switch>
              <Route path="/home" component ={Program}></Route>
                  <Route path="/tasklist" component ={TaskList}></Route>
                  <Route path="/spender" component ={Spender}></Route>
                  <Route path="/taskForm" component ={TaskForm}></Route>
                  <Route path="/postTest" component ={PotsTest}></Route>
              </Switch>
    </Router>

      // {/* </React.Fragment> */
    );
    }
 }
export default App;
