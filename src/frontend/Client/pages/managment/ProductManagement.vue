<template>
  <div>
    <br />
    <b-form @submit="onSubmit" @reset="onReset" v-if="show">
      <b-form-group
        id="input-1"
        class="mb-0"
        label="product id"
        label-for="input-1"
      >
        <b-form-input
          id="input-1"
          v-model="form.id"
          aria-describedby="input-1-help"
          type="input-1"
          placeholder="Enter product id"
          required
        ></b-form-input>
      </b-form-group>
      <b-form-text id="input-live-help">הכנס מספר שלם חיובי</b-form-text>
      <br />
      <b-form-group id="input-group-2" label="Name:" label-for="input-2">
        <b-form-input
          id="input-2"
          v-model="form.name"
          placeholder="Enter product name"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-3" label="description" label-for="input-2">
        <b-form-input
          id="input-3"
          v-model="form.description"
          placeholder="Enter product description"
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-4" label="price" label-for="input-2">
        <b-form-input
          id="input-4"
          v-model="form.price"
          placeholder="Enter product price"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-5" label="color" label-for="input-2">
        <b-form-input
          id="input-5"
          v-model="form.color"
          placeholder="Enter product color"
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-6" label="warrenty" label-for="input-6">
        <b-form-input
          id="input-6"
          v-model="form.warranty_amount"
          placeholder="Enter product warrenty"
        ></b-form-input>
      </b-form-group>
      <b-form-group
        id="input-group-7"
        label="warrenty_time_period"
        label-for="input-7"
      >
        <b-form-select
          id="input-7"
          v-model="form.warranty_time_period"
          :options="time_periods"
        ></b-form-select>
      </b-form-group>

      <b-form-group id="input-group-8" label="catalog" label-for="input-8">
        <b-form-select
          id="input-8"
          v-model="form.catalog"
          :options="catalog"
          required
        >
        </b-form-select>
      </b-form-group>
      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>
    </b-form>
    <b-card class="mt-3" header="Form Data Result">
      <pre class="m-0">{{ form }}</pre>
    </b-card>
  </div>
</template>

<script>
import { namelesscatalog } from "@/assets/data.js";
import "bootstrap/dist/css/bootstrap.min.css";
import productService from "../../ProductService.js";

export default {
  data() {
    return {
      products: [],
      form: {
        id: 0,
        name: "",
        description: "",
        price: 0,
        color: "",
        warranty_amount: 0,
        warranty_time_period: "שנים",
        catalog: "מכונות קפה",
      },
      time_periods: [
        { text: "Select Time Period", value: null },
        "ימים",
        "חודשים",
        "שנים",
      ],

      catalog: namelesscatalog,
      show: true,
    };
  },

  methods: {
    onSubmit(event) {
      productService.addProduct(this.form);
    },
    onReset(event) {
      event.preventDefault();
      // Reset our form values
      this.form.id = 0;
      this.form.name = "";
      this.form.description = "";
      this.form.price = "";
      this.form.color = "";
      this.form.warranty_amount = 0;
      this.form.warranty_time_period = "";

      // Trick to reset/clear native browser form validation state
      this.show = false;
      this.$nextTick(() => {
        this.show = true;
      });
    },
    getProducts() {
      productService.getAllProduct().then((Response) => {
        this.products = Response.data;
      });
    },
    getCatalog() {
		product.forEach(element => {
			
		});
	},
  },
  created() {
    this.getProducts();
  },
};
</script>

<!--   
"id": 3,
"name": "מאקינטה ביאלטי",
"description": "מכונת קפה ידנית על הגז",
"price": 100,
"color": "כסף",
"catalog": "מכונות קפה",
"warranty_amount": 3,
"warranty_time_period": "שנים" -->
