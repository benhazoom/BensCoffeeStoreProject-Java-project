<template>
	<div>
		<input type="text" id="DeleteId" placeholder="insert id for deletion">
		<button v-on:click="deleteProd(idToDelete)">Delete</button>

		<h1 class="text-center">Product List</h1>
	<table class="table table-striped">
		<thead>
			<th>id</th>
			<th>name</th>
			<th>description</th>
			<th>price</th>
			<th>color</th>
			<th>category</th>
			<th>warranty</th>
			<th></th>
		</thead>

		<tbody>
			<tr v-for="product in products" v-bind:key="product.id">
				<td> {{product.id}}</td>
				<td> {{product.name}}</td>
				<td> {{product.description}}</td>
				<td> {{product.price}}</td>
				<td> {{product.color}}</td>
				<td> {{product.catalog}}</td>
				<td>  {{product.warranty_amount}} - {{product.warranty_time_period}}</td>
				<td> </td>

			</tr>
		</tbody>
	</table>	
	
	</div>
</template>
  
  <script>
	import 'bootstrap/dist/css/bootstrap.min.css'
	import productService from "../../ProductService.js"

export default {
	data() {
		return {
			products: [],
		}
	},


	methods: {
		getProducts() {
			productService.getAllProduct().then((Response) => {
				this.products = Response.data;
			})
		},
		deleteProd() {
			var idToDelete = document.getElementById("DeleteId").value
			productService.deleteProduct(idToDelete)
			location.reload();
		}
	},

	created() {
		this.getProducts()

	}
}
  </script>