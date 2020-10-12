import React, {Component} from 'react';
import {Nav, Navbar} from "react-bootstrap";


class NavigationBar extends Component {
    render() {
        return (
            <div>
                <Navbar bg="dark" variant="dark">
                    <Navbar.Brand href="#home">Navbar</Navbar.Brand>
                    <Nav className="mr-auto">
                        <Nav.Link href="/home">Home</Nav.Link>
                        <Nav.Link href="/tasklist">Task List</Nav.Link>
                        <Nav.Link href="/spender">Spender</Nav.Link>
                        <Nav.Link href="/taskForm">TaskForm</Nav.Link>
                        <Nav.Link href="/postTest">postTest</Nav.Link>
                    </Nav>
                </Navbar>
            </div>);
    }
}

export default NavigationBar;
