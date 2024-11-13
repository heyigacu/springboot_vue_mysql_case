<template>


  <div class="common-layout">
    <el-container style="max-width: 70%; margin-left:auto; margin-right:auto;">
      <el-header class="header" height="150px">KokumiPD</el-header>
      <el-main id="main" style="padding: 0; background-color: white;">

        <el-menu
          :default-active="activeIndex"
          :ellipsis="false"
          class="el-menu-demo"
          mode="horizontal"
          @select="handleSelect"
          background-color="gray"
          router=true
        >
          <el-menu-item index="/predict" id="item" >Predict</el-menu-item>
          <el-menu-item index="/database" id="item" >Database</el-menu-item>
          <el-menu-item index="/introduce" id="item" >Introduce</el-menu-item>
          <el-menu-item index="/contact" id="item" >Contact</el-menu-item>
        </el-menu>
        <div>
          <RouterView></RouterView>
        </div>

      </el-main>
      <el-footer class="footer">
        <div>Copyright © 2023 Key Laboratory for Molecular Enzymology & Engineering. JlU All Rights Reserved.</div> 
        Designed by HwwLab.

        KokumiPD ©2023 Created by Yi He
      </el-footer>
    </el-container>
  </div>
</template>


<script setup>
</script>

<style>
.common-layout{
  height: 100vh;
}
.el-container {
  height: 100%;
}

.header{
  height: 200;
  background-color: #FEDD89;
  font-size: xx-large;
  color: white;
  font-weight: bolder;
}

#main{
  margin-top: 0;
}

#item{
    width: 25%;
    font-size: x-large;
    color: white;
  }
.footer{
  background-color: #f0f2f5;
  text-align: center;
  line-height: 60px;
  /* position: absolute;
  bottom: 0;  */
}
/* .router-link-active {
  text-decoration: none;
  color: orange;
}
a{
  text-decoration: none;
  color: grey;
} */

</style>
