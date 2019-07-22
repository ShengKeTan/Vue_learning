<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
import Login from '@/components/Login.vue'

export default {
  name: 'App',
  components:{
    'Login':Login
  }
}
</script>

<style scoped>
  /*#app{
    text-align: center;
    margin-top: 250px;

  }*/
/*#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}*/
</style>
