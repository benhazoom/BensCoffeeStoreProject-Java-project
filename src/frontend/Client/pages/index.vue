<template>
	<div>
	  <Hero />
	  <br>
	  <br>

	  
	  <!--3. for every large card in largeCardInfo apply the LargeCardDisplay component -->
	  <LargeCardSectionDisplay
		v-for="cardInfo in largeCardInfo"
		:key="cardInfo.id"
		:cardsSection="cardInfo"
	  />
	  <SmallCardDisplay 
		v-for="cardInfo in smallCardSections"
		:key="cardInfo.id"
		:cardsSection="cardInfo"
	  /> 
	</div>
  </template>
  
  <script>
  import { CoffeeMachinesSection } from "@/assets/data.js" //1.importing sections of data from out DB
  export default {
	data(){
	  return {
		largeCardInfo: CoffeeMachinesSection,				//2.naming every largeCardSections from DB under CoffeeMachinesSection
					
	  }
	}
  }
  </script>
  
  <style>
  
  </style>
  