<template>
    <div>
      <LargeCardSectionDisplay
      v-for="cardInfo in products"
      :key="cardInfo.id"
      :cardsSection="cardInfo"
      />
        
    </div>
</template>
<script>
import productService from "../../ProductService.js"
import {CoffeeMachinesSection} from "../../assets/data.js"

export default {
  data(){
    return {
        products: CoffeeMachinesSection			//2.naming every largeCardSections from DB under largeCardInfo
    }
  }
}
</script>
<style>
    
</style>