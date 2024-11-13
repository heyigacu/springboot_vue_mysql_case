<template>
    <div>
        <el-table :data="tableData" border=true >
      <el-table-column prop="id" label="ID" width="50px" />
      <el-table-column prop="smiles" label="smiles" width="280" />
      <el-table-column prop="type" label="type" width="180" />
      <el-table-column prop="affinity" label="affinity" width="280" />
      <el-table-column prop="reference" label="reference" width="180" />
      <el-table-column prop="img" label="img" width="180" />
      <el-table-column prop="createTime" label="createTime" />
    </el-table>
    </div>


    <div class="demo-pagination-block">
    <!-- <el-pagination
      v-model:current-page="currentPage4"
      v-model:page-size="pageSize4"
      :page-sizes="[100, 200, 300, 400]"
      :small="small"
      :disabled="disabled"
      :background="background"
      layout="total, sizes, prev, pager, next, jumper"
      :total="400"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
    /> -->
  </div>
</template>

<script >
import axios from "axios"
const tableData = []
export default{
    data: function(){
        return{tableData}
    },
    methods:{
        
    },
    mounted(){
      axios.get("http://localhost:8080/molecules").then((result)=>{
        console.log(result.data.data)
        this.tableData = result.data.data
      })
    }
}
</script>

<style>


</style>


  
  