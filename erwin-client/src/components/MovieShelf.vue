<template>
<div>
    <b-navbar toggleable="lg" type="dark" variant="info">
       <b-navbar-brand href="#">My Shelf</b-navbar-brand>
       
        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

        <b-collapse id="nav-collapse" is-nav>
            <b-navbar-nav>
                <b-nav-item href="#">home</b-nav-item>
                <b-nav-item href="#">about</b-nav-item>
                <b-nav-item href="#">library</b-nav-item>
            </b-navbar-nav>

            <!-- Right aligned nav items  -->
            <b-navbar-nav class="ml-auto">
                <b-nav-form>
                    <b-form-input size="sm" class="mr-sm-2" placeholder="Search"></b-form-input>
                    <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
                </b-nav-form>

                <b-nav-item-dropdown text="Me" right>
                    <b-dropdown-item href="#">Profile</b-dropdown-item>
                    <b-dropdown-item href="#">Sign Out</b-dropdown-item>

                </b-nav-item-dropdown>

            </b-navbar-nav>

        </b-collapse>
   </b-navbar> 

   <b-list-group >
       <b-list-group-item v-for="movie in movies" :key="movie.id">
           {{movie.name}}
       </b-list-group-item>
   </b-list-group>
</div>
    
</template>

<script>
export default {
    name: 'Shelf',
    data() {
       return {
            movies: [
             {id:1, name:"Terminator"},
             {id:2, name:"SAW"},
             {id:3, name:"JAWS"},
        ]
       }
    }
}
</script>

<style scoped>

</style>

