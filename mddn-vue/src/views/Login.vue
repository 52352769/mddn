<template>
  <el-row :gutter="20">
    <el-col :span="8" :offset="8">
      <el-form label-width="120px" class="login-form">
        <el-form-item label="用户名" prop="username">
            <el-input placeholder="请输入用户名..."></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
            <el-input type="password" placeholder="请输入密码..."></el-input>
        </el-form-item>
        <!-- 验证码.... -->
        <el-form-item>
            <el-button type="primary">确认</el-button>
        </el-form-item>
        <!-- <div>
            <p>找回密码</p>
        </div> -->
      </el-form>
    </el-col>
  </el-row>
  <!-- <div class="login-form-div">
    
    
  </div> -->
</template>
<script lang="ts">

</script>
<style scoped>
.login-form{
    /* width: 50%; */
    /* height: 25%; */
    /* border: solid #000 3px; */
    padding-top: 5%;
    padding-right: 5%;
    margin-top: 25%;
    
}

</style>