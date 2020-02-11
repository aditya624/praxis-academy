import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component{
  callFirstName = () =>{
    return new Promise((resolve,reject)=>{
      setTimeout(()=>{
        resolve('pikacu ')
      },3000)
    })
  }
  callLastName = () =>{
    return new Promise((resolve,reject)=>{
      setTimeout(()=>{
        resolve('pikaca')
      },3000)
    })
  }

  login = ()=>{
    Promise.all([this.callFirstName(),this.callLastName()])
    .then(([result,result2])=>{
      this.setState({text:result+result2})
    })
    // this.callFirstName()
    // .then(result=>{
    //   return this.callLastName(result)
    // })
    // .then(result2=>{
    //   this.setState({
    //     text:result2
    //   })
    // }) 
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

