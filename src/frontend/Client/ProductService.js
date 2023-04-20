const apiURL = 'http://localhost:8080/api/v1/product'
const axios = require('axios').default

class ProductService {
  addProduct (form) {
    // if (false) {
    //   alert("מספר מזהה לא תקין נא להכניס מספר שלם חיובי");
    // } else {
    axios.post(apiURL, form)
      .then((responsr) => {
        if (responsr.status === false) { alert('כבר קיים מוצר עם מספר מזהה זהה לכן ההוספה לא התבצעה') } else { alert('המוצר התווסף בהצלחה') }
      })
  }

  getAllProduct () {
    return axios.get(apiURL)
  }

  async deleteProduct (id) {
    const deleteURL = apiURL + '/' + id
    await axios.delete(deleteURL)
      .then(r => alert(r))
  }
}

export default new ProductService()
