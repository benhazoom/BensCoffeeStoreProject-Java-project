<template>
    <nav class="navbar navbar-dark bg-dark padding ">
		
    <NuxtLink class="navbar-brand" to="/">Home Page</NuxtLink>
    <div>
	<Category
      v-for="catalog in catalogsInfo"
      :key="catalog.name"
      :catalog="catalog"
    />
    </div>

	<NuxtLink class="navbar-brand" to="/managment">Management</NuxtLink>

    </nav>
</template>

<script>
import { catalog } from "@/assets/data.js"
import Category from './Category.vue';
	export default {
    data() {
        return {
            catalogsInfo: catalog
        };
    },
    components: { Category }
}
	</script>

<style scoped>
    .padding {
        padding: 0.5rem;
        background-color: black
    }
    .nav-left {
        margin-left: auto;
    }
	.navbar{
		text-align: right;
	}

</style>