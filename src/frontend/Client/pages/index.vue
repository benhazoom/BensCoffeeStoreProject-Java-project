<template>
  <div>
    <Hero />
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
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
import { largeCardSections, smallCardSections } from "@/assets/data.js" //1.importing sections of data from out DB
export default {
  data(){
    return {
      largeCardInfo: largeCardSections,				//2.naming every largeCardSections from DB under largeCardInfo
      smallCardSections: smallCardSections			//4. look at comments 2. and 3. doing the same for small cards
    }
  }
}
</script>

<style>

</style>
