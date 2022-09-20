<template>
	<div>
		<input type="text" id="DeleteId" placeholder="למחיקה id הכנס">
		<button v-on:click="deleteProd(idToDelete)">מחק</button>

		<h1 class="text-center">Product List</h1>
	<table class="table table-striped">
		<thead>
			<th>id</th>
			<th>שם</th>
			<th>תיאור</th>
			<th>מחיר</th>
			<th>צבע</th>
			<th>קטגוריה</th>
			<th>משך אחריות</th>
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
const apiUrl = "https://localhost:8080/api/v1/product"

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