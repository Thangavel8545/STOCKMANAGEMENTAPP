import React,{useState} from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
import './homesty.css';
import Hometab from './Hometab';

const Home = () => {
  const[custid,setcustid]=useState('');
  const[billno,setBillno]=useState('');
  const[amount,setAmount]=useState('');
  const[buyer,setBuyer]=useState('');
  const[bank,setBank]=useState('');
  const[location,setLocation]=useState('');
 

 

  const[id,setId]=useState('');
 
  
  const handleGet =() =>{
    
  }
  const handleDelete = () => {
    // Convert the ID to a number (assuming it's a numeric ID)
    const idToDelete = parseInt(id);

    if (!idToDelete) {
      // Handle the case where id is not a valid number
      alert('Please enter a valid ID to delete.');
      return;
    }


    axios
      .delete(`http://127.0.0.1:8081/delid/${idToDelete}`)
      .then((response) => {
        console.log('Successfully deleted:', response.data);
        
      })
      .catch((error) => {
        console.error('Error deleting:', error);
      });
  }
  const handlePut = (e) =>
  {
     e.preventDefault();
    axios.put('http://127.0.0.1:8081/update',
    {
    custid:custid,
    billno:billno,
    amt:amount,
    buyer:buyer,
    bank:bank,
    location:location
    
    
    
  }
    )
  }


  const handlePost = (e) =>{
    e.preventDefault();
    axios.post('http://127.0.0.1:8081/addbill',
    {
     
    billno:billno,
    amt:amount,
    buyer:buyer,
    bank:bank,
    location:location,
  
  }
    )
};

  return (
    <div>
   
    
    <nav id='nav'>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/about">About</Link>
        </li>
        <li>
          <Link to="/contact">Contact</Link>
        </li>
      </ul>
    </nav>
     
      <div class='container'>
      <form class='form-table'>

      <div className='form-group'>
      <label>PRODUCT ID:</label>
      <input class="form-control"
      type='number'
      nameholder='Enter the ID FOR UPDATE'
      value={custid}
      onChange={(e) => setcustid
        
        
        (e.target.value)}></input>
      </div>
      
      <div className='form-group'>
      <label>QUANTITY:</label>
      <input class="form-control"
      type='number'
      nameholder='TOTAL COUNT'
      value={billno}
      onChange={(e) => setBillno(e.target.value)}></input>
      </div>

      <div className='form-group'>
      <label>PRICE: </label>
      <input class="form-control"
      type='number'
      nameholder='Enter the Price'
      value={amount}
      onChange={(e) => setAmount(e.target.value)}></input>
      
      </div>
     <div class='form-group'>
      <label>PRODUCT NAME:</label>
      <input class="form-control"
      type='text'
      nameholder='Enter the Product Name'
      value={buyer}
      onChange={(e) => setBuyer(e.target.value)}></input>
      </div>
      <div class='form-group'>
      <label>MANUFACTURER:</label>
      <input class="form-control"
      type='String'
      nameholder='Enter the MANUFACTURER'
      value={bank}
      onChange={(e) => setBank(e.target.value)}></input>
      </div>
      <div class='form-group'>
      <label>COMMODITY TYPE:</label>
      <input class="form-control"
      type='String'
      nameholder='Enter the Type of goods'
      value={location}
      onChange={(e) => setLocation(e.target.value)}></input>
      </div>
     
      
    
      <div class="d-grid gap-2">
      <button id='but' class="btn btn-info" onClick={handlePost}>ADD THE PRODUCT</button>
      <button id='but' class="btn btn-danger" onClick={handleGet}>SHOW THE PRODUCT</button>
          <button id='but' class="btn btn-info" onClick={handlePut}>UPDATE PRODUCT INFO</button>

      <div class='form-group'>
      <label>DELETE PRODUCT ID:</label>
      <input class="form-control"
      type='number'
      placeholder='Enter the Id to delete'
      value={id}
      onChange={(e) => setId(e.target.value)}></input>
      </div>  
      <button id='but' class="btn btn-info" onClick={handleDelete}>DELETE</button></div>

     
     
      </form>
      </div>
      <Hometab/>
    </div>
  );
};

export default Home;