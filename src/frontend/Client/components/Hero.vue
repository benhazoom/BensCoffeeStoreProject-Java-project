<template>
    <div class="Hero container">
        <div class="text-container">
            <h1 class="header">כשקפה וסיפור נפגשים בכוס</h1>
            <p class="snippet">חנות הקפה של בנימין היא המקום המושלם למצוא איך להוסיף עניין וחוויה לסיפור הקפה שלכם</p>
			<br>
			<br>
            <button class="button btn">למוצרי הקפה שלנו</button>
        </div>
        <img class="image" src="~assets/svg/coffee-cup-logo.png" alt="fire extinguisher">
    </div>
</template>

<script>
    export default {
    }
</script>

<style scoped>
    .Hero {
        height: 50vh;
        position: relative;
        display: flex;
        align-items: flex-start;
        justify-content: space-between;
    }

    .text-container {
		width: 50%;
        margin-top: 3rem;
    }

    .header {
        font-weight: 900;
        font-size: 5em;
		text-align: right;
    }

    .snippet {
        color: grey;
        font-size: 1.25rem;
		text-align: right;

    }

    .image {
        width: 27.5rem;
        margin-top: 1rem;
    }

    .overlay {
        background: rgba(0, 0, 0, 0);
        position: absolute;
        width: 100%;
        height: 100%;
        top: 0;
    }

    .button {
		margin-left: 45%;
		margin-right: 15%;
        padding: 1rem 4rem;
        border-radius: 100rem;
        background-color: rgb(231, 81, 43);
        color: white;
        width: 20rem;
        font-weight: 700;
        transition: 0.5s;

		
    }

    .button:hover {
        width: 21.5rem;
    }

    @media (max-width: 500px) {
        .Hero {
            height: 40vh;

        }
    }
</style>