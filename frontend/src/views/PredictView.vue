<template>
    <div>
        predict
        <div><el-button type="primary">Primary</el-button></div>
        <el-card style="max-width: 480px">
            <p v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</p>
        </el-card>
    </div>
</template>


<script>



</script>