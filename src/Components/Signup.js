import React, { useState } from 'react';
import './signupstyle.css';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import Signtab from './Signtab';
//import { useNavigate } from 'react-router-dom';
const Signup = () => {
  const [name, setName] = useState('');
  const [mobileno, setMobileno] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [cpassword, setCPassword] = useState('');
  const [panno, setPANNo] = useState('');

 //
 const history=useNavigate();
  const handleNext = () =>{
      history("/home");
  }
  const handleSignup = (e) => {
         e.preventDefault();
         axios.post('http://127.0.0.1:8081/adduser',
         {
            
		name : name,
    phno : mobileno,
		pan : panno,
		email :email,
		password : password,
		npass : cpassword
         }
         ).then((response) => {
        console.log('Successfully deleted:', response.data);
        setName("")
        setMobileno("")
        setEmail("")
        setPANNo("")
        setCPassword("")
        setPassword("")
        
      })
      .catch((error) => {
        console.error('Error deleting:', error);
      });
  };

  return (
    <form id='res'>
    <div class="container">
    <div id='signup'>
    
    <h1>SIGN UP</h1>
      
      <input 
        type="text"
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <br></br>
      <input
      type="long"
      placeholder="Mobile Number"
      value={mobileno}
      onChange={(e) => setMobileno(e.target.value)}
    />
    <br></br>
      <input
        type="text"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <br></br>
      <input
        type="password"
        placeholder="New Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <br></br>
      <input
        type="password"
        placeholder="Confirm Password"
        value={cpassword}
        onChange={(e) => setCPassword(e.target.value)}
      />
      <br></br>
      <input
        type="string"
        placeholder="COMPANY GST/PAN"
        value={panno}
        onChange={(e) => setPANNo(e.target.value)}
      />
      <br></br>
      <button onClick={handleSignup}>Sign Up</button>
      <button onClick={handleNext}>Next</button>
      </div>
    </div>
    
    </form>
  );
};

export default Signup;