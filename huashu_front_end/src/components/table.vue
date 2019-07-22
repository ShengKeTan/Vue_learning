<template>
    <div id="table">
      <el-button @click="getdata">click</el-button>
      <table>
        <thead>
          <tr>
            <th>name</th>
            <th>age</th>
            <th>name</th>
          </tr>
        </thead>
      </table>
    </div>
</template>

<script>
    export default {
        name: 'table',
        data(){
          return{
            people:[{name:'',pass:''}]
          }
        },
        methods:{
          getdata(){
            this.$axios({
              url:'http://127.0.0.1:8081/huasu/table',
              method:'get',
              data:'success'
            }).then(res=>{
              console.info('后台返回的数据',res.data);
              alert(res.data);
            }).catch(err => {
              console.info('报错的信息',err.response.message);
            });
          }
        }
    }
</script>

<style scoped>

</style>
