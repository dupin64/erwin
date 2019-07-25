<template>
    <div class="login-wrapper border border-light">
       <!-- @submit.prevent directive actually points the usual submit action to the login method we defined -->
    <form class="form-signin" id="login-form" @submit.prevent="login" >
        <h2 class="form-signin-heading"> Login to Erwin</h2>
        <label for="inputUserName" class="sr-only">username</label>
        <input v-model="username" type="text" id="inputUserName" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only"> password</label>
        <input v-model="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">LOGIN </button>
    </form>
         </div>
</template>

<script>
export default {
    name: 'Login',
    data(){
       return{
           username: '',
           password: ''
       }
    },
    methods: {
       login () {
           //console.log(this.username);
          // console.log(this.password);
       }
    }
    
}
</script>

<style scoped>
.login-wrapper {
    background: #ffffff;
    width: 70%;
    margin: 12% auto;
}

.form-signin {
    max-width: 330px;
    padding: 10% 15px;
    margin: 0 auto;
    font-weight: normal;
}

.form-signin .form-signin-heading {
    margin-bottom: 10px;
}

.form-signin .form-control {
    position: relative;
    height: auto;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    padding: 10px;
    font-size: 16px;   
}

.form-signin .form-control:focus {
    z-index: 2;
}

.form-signin input[type="text"] {
    margin-bottom: -1px;
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
    margin-bottom: 10px;
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0;
}
</style>


