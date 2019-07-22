<template>
  <div id="Login" class="login">
    <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-row type="flex" justify="center">
        <el-form-item label-width="70px">
          <span><font color="#87ceeb" size="5">注册登录页面</font></span>
        </el-form-item>
      </el-row>
      <el-row type="flex" justify="center">
        <el-col :span="5">
          <el-form-item label="姓名" prop="name">
            <el-input prefix-icon="el-icon-date" v-model="ruleForm.name" size="small"></el-input>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row type="flex" justify="center">
        <el-col :span="5">
          <el-form-item label="密码" prop="pass">
            <el-input type="password" v-model="ruleForm.pass" autocomplete="off" size="small"></el-input>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row type="flex" justify="center">
        <el-form-item>
          <el-button type="primary" @click="submitLoginForm('ruleForm')">登陆</el-button>
          <el-button type="primary" @click="submitRegisterForm('ruleForm')">注册</el-button>
        </el-form-item>
      </el-row>
    </el-form>
  </div>
</template>


<script>
    export default {
      name: "Login",
      data() {
        return {
          ruleForm: {
            name:'',
            pass: '',
          },
          rules: {
            name: [
              {required:true,message:'请输入用户名',trigger:'blur'},
            ],
            pass: [
              {required:true,message:'请输入密码',trigger:'blur'},
            ],
          },
        };
      },


      methods:{
        submitLoginForm(forName){
          this.$refs[forName].validate((valid) => {
            /*if(valid){
              let data = {
                username: this.ruleForm.name,
                password: this.ruleForm.pass
              };
              postRequest(data,'login').then(reponse =>{
                console.log(reponse);
                store.commit('login', response);
                this.$router.push({name: 'user_info'});
              }).catch(reason => {
                console.log(reason);
                this.alertError();
              });
            }else{
              this.alertInfo();
              return false;
            }*/

            let data = {
                username: this.ruleForm.name,
                password: this.ruleForm.pass
              };
            console.log(data)
            if(valid){
              this.$axios({
                url:'http://127.0.0.1:8081/huasu/login',
                method:'post',
                data:data
              }).then(res=>{
                console.info('后台返回的数据',res.data);
                if(res.data==="login success"){
                  this.$notify({
                    type: 'success',
                    message: '欢迎你,' + this.ruleForm.name + '!',
                    duration: 3000
                  })
                }
              }).catch(err => {
                console.info('报错的信息',err.response.message);
              });
            }else {
              this.$Message.error('表单校验失败！');
            }
          });
        },

        submitRegisterForm(forName){
          this.$refs[forName].validate((valid) => {
            let data = {
              username: this.ruleForm.name,
              password: this.ruleForm.pass
            };
            console.log(data)
            if(valid){
              this.$axios({
                url:'http://127.0.0.1:8081/huasu/register',
                method:'post',
                data:data
              }).then(res=>{
                console.info('后台返回的数据',res.data);
              }).catch(err => {
                console.info('报错的信息',err.response.message);
              });
            }else {
              this.$Message.error('表单校验失败！');
            }
          });
        }

      }
    }
</script>

<style scoped>
  .login{
    position: fixed;
    width: 100%;
    height: 100%;
    background: url("../assets/timg.jpg");
    background-size: 100% 100%;
  }


</style>
