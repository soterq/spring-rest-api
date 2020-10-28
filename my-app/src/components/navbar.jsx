import React, {Component} from 'react';
import {Nav, Navbar} from "react-bootstrap";


class NavigationBar extends Component {
    render() {
        return (
            <div>
                <Navbar bg="dark" variant="dark">
                    <Navbar.Brand href="/home">Navbar</Navbar.Brand>
                    <Nav className="mr-auto">
                        <Nav.Link href="/program">Program</Nav.Link>
                        <Nav.Link href="/tasklist">Task List</Nav.Link>
                        <Nav.Link href="/spender">Spender</Nav.Link>
                        <Nav.Link href="/taskForm">Task Form</Nav.Link>
                        <Nav.Link href="/postTest">Post Test</Nav.Link>
                        <Nav.Link href="/planForm">Plan Form</Nav.Link>
                        <Nav.Link href="/placeForm">Place Form</Nav.Link>
                        <Nav.Link href="/language">Languages Form</Nav.Link>s
                    </Nav>
                </Navbar>
            </div>);
    }
}

export default NavigationBar;
