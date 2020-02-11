import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component{
  callFirstName = (callBack) =>{
    setTimeout(()=>{
      callBack('Pikacu ')
    },3000)
  }
  callLastName = (cb) =>{
    setTimeout(()=>{
      cb('Pikaca')
    },3000)
  }

  login = ()=>{
    this.callFirstName((result)=>{
      const first = result;
      this.callLastName((result2)=>{
        const last = result2;
        const name = first + last;
        this.setState({text:name})
      })
      
    })
    
  }  
  state = {
    text: 'Disini ada teks gaes'
  }
  render(){
    const {login}=this;
    const {text}=this.state;
    return (
      <div className="App">
        <h1>{text}</h1>
        <button onClick={login}>login</button>
        <div></div>
      </div>
    );
  }  
}
export default App;

