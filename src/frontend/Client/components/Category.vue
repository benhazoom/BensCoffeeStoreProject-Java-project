<template>
	<!-- makes every small card component a link -->
    <nuxt-link class="navbar-brand" :to="`/catalog/${catalog.name}`">{{ catalog.name }}</nuxt-link>
</template>

<script>
    export default {
        props: ["catalog"]
    }
</script>

<style  scoped>

</style>