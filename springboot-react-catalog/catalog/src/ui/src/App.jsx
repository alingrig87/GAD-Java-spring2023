import { useState, useEffect } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import axios from 'axios'
import './App.css'

function App() {
  const [students, setStudents] = useState([]);

  function getStudentsFromAPI() {
    axios.get("http://localhost:8080/students")
        .then(students => setStudents(students.data))
  }

  useEffect(getStudentsFromAPI, []);

  return (
    <div className="users">
        <table className="students">
            <thead>
                <th>FirstName</th>
                <th>Last Name</th>
                <th>Grades</th>
                <th>Average</th>
            </thead>
            <tbody>
       {students.map((student,i) =>
                        <tr key={i}>
                            <td>{student.firstName}</td>
                            <td>{student.lastName}</td>
                            <td>{student.grades.join(',')}</td>
                            <td>{student.average}</td>
                        </tr>)
       }
            </tbody>
        </table>

    </div>
  )
}

export default App
