<template>
    <div class="container">
        <!-- <input type="text" name="username" id="username-field" placeholder="Username" v-model="username">
        <input type="password" name="password" id="password-fielc" placeholder="Password" v-model="password">
    </div> -->
    <form id="login-form" @submit.prevent="login" >
        username: <br>
        <input v-model="username" type="text" name="username"><br>
        password: <br>
        <input v-model="password" type="password" name="password">
        <br>
        <button type="submit">Sign in </button>
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
           console.log(this.username);
           console.log(this.password);
       }
    }
    
}
</script>

