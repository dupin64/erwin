import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Login from './views/Login.vue'
import Library from './components/MovieLibrary.vue'
import Shelf from './components/MovieShelf.vue'
import UserProfile from './components/UserProfile.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/home',
      name: 'home',
      component: Home
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: '/login',
      name: 'login',
      component: Login
      
    },
    {
      path: '/library',
      name: 'library',
      component: Library
      
    },
    {
      path: '/shelf',
      name: 'shelf',
      component: Shelf
      
    },
    {
      path: '/profile',
      name: 'profile',
      component: UserProfile
      
    }
  ]
})
