import { useState, useEffect } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import axios from 'axios'
import './App.css'

function App() {
  const [students, setStudents] = useState([]);
  const [users, setUsers] = useState([]);

  function getStudentsFromAPI() {
    axios.get("http://localhost:8080/students")
        .then(students => setStudents(students.data))
  }

    function getGitHubUsersFromAPI() {
      axios.get("https://api.github.com/users")
          .then(users => setUsers(users.data))
    }

//   useEffect(getStudentsFromAPI, []);
  useEffect(getGitHubUsersFromAPI, []);




  return (
    <div className="users">

{/*        {students.map((student,i) => <h1 key={i}>{student.firstName} {student.lastName}</h1>)} */}
       {users.map((user,i) =>
       <div key={i}>
            <img src={user.avatar_url} width={60}/>
            <h5>{user.login}</h5>
       </div>)}

    </div>
  )
}

export default App
