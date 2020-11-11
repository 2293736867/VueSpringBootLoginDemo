<template>
    <div>
        <b-img src="../assets/logo.png"></b-img>
        <b-container>
            <b-row align-h="center">
                <b-col>
                    <b-jumbotron header="注册成功" lead="欢迎" v-if="val"></b-jumbotron>
                    <b-jumbotron header="登录成功" lead="欢迎" v-else></b-jumbotron>
                </b-col>
            </b-row>
        </b-container>
    </div>
</template>

<script>
export default {
    name: "Index.vue",
    props:['val']
}
</script>

<style scoped>

</style>