import Vue from 'vue'
import Router from 'vue-router'
import Logon from '../components/Login.vue'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/',
      name:'index',
      redirect:'/table'
    },
    {
      path: '/logon',
      name: 'logon',
      component: () => import('../components/Login.vue')
    },
    {
      path: '/table',
      name: 'table',
      component:  () => import('../components/table.vue')
    }
  ]
})
