<template>
  <div id="app">
    <div><img src="./assets/erwin_logo.png" alt="erwin logo"></div>
      <nav>
       <router-link to="/home">Home</router-link> |
      <router-link to="/about">About</router-link> |
      <router-link to="/login">Login</router-link>
    </nav>
    <router-view />
   
  </div>
</template>

<script>

export default {
  name: 'app'
}
</script>


<style>

  img {
    height:200px;
    width: 200px;
  }

  body {
    background-color: #dddddd;
  }

  h1 {
    padding: 0;
    margin-top: 0;
  }

  #app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  }

  nav {
    padding: 20px 20px 20px 0;
  }

  nav a {
    padding: 10px;
    text-decoration: none;
    background: #f0f0f0;
    border-radius: 3px;
    color: rgb(0, 110, 255);
    font-weight: bold;
    margin-right: 15px;

  }

  
</style>
