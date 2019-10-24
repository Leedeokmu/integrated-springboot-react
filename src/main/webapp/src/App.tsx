import React from 'react';
import './App.css';
import {Link, Route} from "react-router-dom";

const App: React.FC = () => {
  return (
    <div className="App">
        <ul>
            <li>
                <Link to="/">Index</Link>
            </li>
            <li>
                <Link to="/users">users</Link>
            </li>
        </ul>
        <Route path="/" exact={true} component={Index}/>
        <Route path="/users" exact={true} component={Users}/>
    </div>
  );
}

const Index: React.FC = () => {
    return (
        <div>
            index
        </div>
    )
}

const Users: React.FC = () => {
    const users = [
        {
            id: "1",
            name: "su"
        }, {
            id: "2",
            name: "fine"
        }
    ];
    return (
        <div>
            {users.map(user => (
                <div key={user.id}>{user.name}</div>
            ))}
        </div>
    )
}

export default App;
