const apiURL = "http://localhost:8080/api/v1/product";
const axios = require("axios").default;
var cors = require('cors')

class ProductService {
  addProduct(form) {
    // if (false) {
    //   alert("מספר מזהה לא תקין נא להכניס מספר שלם חיובי");
    // } else {
        axios.post(apiURL,form)
        .then((responsr) => {
        if (responsr.status == false)
          alert("כבר קיים מוצר עם מספר מזהה זהה לכן ההוספה לא התבצעה");
        else alert("המוצר התווסף בהצלחה");
      });
    }
  

  getAllProduct() {
    return axios.get(apiURL);
  }

  // public Optional<Product> getProductById(int id) {
  // 	return productDao.selectProductByid(id);
  // }

  async deleteProduct(id) {
    const deleteURL = apiURL + "/" + id
    const r = await axios.delete(deleteURL)
	.then(r => alert(res))
  }

  // public boolean updateProduct(Product productToUpdate) {
  // 	return productDao.UpdateProduct(productToUpdate);
  // }
}

export default new ProductService();
