package mx.edu.potros.practica4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listview: ListView = findViewById(R.id.listview) as ListView

        var adaptador: AdaptadorProductos = AdaptadorProductos(this,menu)
        listview.adapter = adaptador
    }

    fun agregarProductos(option: String?){
        var titulo: ImageView = findViewById(R.id.menuImage)
            when(option){
                "Antojitos" -> {
                    titulo.setImageResource(R.drawable.antojitos)
                    menu.add(Product("Quesadillas",R.drawable.quesadillas,"Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.",5.69))
                    menu.add(Product("Huarache",R.drawable.huaraches,"Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream",10.85))
                    menu.add(Product("Gringas",R.drawable.gringas,"Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple",7.99))
                    menu.add(Product("Sincronizadas",R.drawable.sincronizadas,"Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.",7.69))
                    menu.add(Product("Sopes",R.drawable.sopes,"Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes",3.56))
                    menu.add(Product("Tostadas",R.drawable.tostadas,"Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes",3.73))
                }
                "Especialidades" -> {
                    titulo.setImageResource(R.drawable.especialidades)
                    menu.add(Product("Mojarra Frita - FriedFish",R.drawable.mojarra,"Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas. Agregue arroz y frijoles por \$1.50 adicinales Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas. Add rice and beans for \$1.50 extra.",15.99))
                    menu.add(Product("Ceviche",R.drawable.ceviche,"Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips",6.99))
                    menu.add(Product("Fajita Quesadilla",R.drawable.fajitaquesadilla,"Quesadilla extra grande, rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada Extra large quesadilla with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.",13.99))
                    menu.add(Product("Botana de Camarones",R.drawable.botanacamarones,"",13.99))
                    menu.add(Product("Coctel Camaron",R.drawable.coctel,"",14.50))
                }
                "Combinations" -> {
                    titulo.setImageResource(R.drawable.combinations)
                    menu.add(Product("Traditional Taco Combo",R.drawable.combinationtaco,"Tortilla de Maiz, tu carne favorita, servido con arroz y frijoles Corn tortilla taco, your choice of meat, served with rice and beans",6.99))
                    menu.add(Product("Mexican Burritos",R.drawable.cominationburros,"Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.",11.99))
                    menu.add(Product("Los Portales Burrito",R.drawable.burritosportales,"A flour tortilla wrapped around grilled cactus, steak, pastor, (Seasoned Pork) grilled onions, rice and beans. Served a side of lettuce salad, tomatoes, sour cream and guacamole.",12.99))
                    menu.add(Product("Cinco",R.drawable.cinco,"One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.",7.99))
                    menu.add(Product("Dos Amigos",R.drawable.dosamigos,"Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans",8.99))
                    menu.add(Product("Burrito Pepe",R.drawable.burritopepe,"A flour tortilla wrapped around your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.",7.49))
                }
                "Tortas" -> {
                    titulo.setImageResource(R.drawable.tortas)
                    menu.add(Product("Torta Regular",R.drawable.torta,"All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.", 11.99))
                    menu.add(Product("Torta -Milanesa de Res o Pollo",R.drawable.tortamilanesa,"Breaded Steak or Chicken",12.99))
                    menu.add(Product("Torta Cubana",R.drawable.tortacubana,"Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese",13.59))
                    menu.add(Product("Torta Mixta",R.drawable.tortamixta,"Chorizo, asada y pastor./ Mexican sausage, steak and marinated pork.",12.99))
                    menu.add(Product("Small Mexican Torta",R.drawable.smallmexican,"Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream.",7.39))
                }
                "Sopas" -> {
                    titulo.setImageResource(R.drawable.sopas)
                    menu.add(Product("Pozole", R.drawable.pozole, "Weekends only", 5.99))
                    menu.add(Product("Menudo", R.drawable.menudo, "Wednesday to Sunday", 5.99))
                    menu.add(Product("Caldo de Res", R.drawable.caldores, "", 5.99))
                    menu.add(Product("Caldo de Camarón", R.drawable.caldocamaron, "Shrimp soup", 12.99))
                    menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, "Seafood soup", 19.99))
                    menu.add(Product("Coctel de Camaron", R.drawable.coctel, "Shrimp cocktail", 14.99))
                }
                "Drinks" -> {
                    titulo.setImageResource(R.drawable.drinks)
                    menu.add(Product("Soda 20oz.",R.drawable.sodas, "",2.99))
                    menu.add(Product("Jarritos",R.drawable.jarritos,"",2.35))
                    menu.add(Product("Domestic Beer",R.drawable.domesticbeer,"",3.55))
                    menu.add(Product("Mexican Beer",R.drawable.mexicanbeer,"",3.99))
                    menu.add(Product("Micheladas",R.drawable.michelada,"",6.75))
                    menu.add(Product("Caguama",R.drawable.caguama,"",8.99))
                    menu.add(Product("Caguama Michelada",R.drawable.caguamamichelada,"",10.99))
                    menu.add(Product("Cubetazos",R.drawable.cubetazo,"",21.99))
                    menu.add(Product("Charolazo con Camarones",R.drawable.charolazo,"",21.99))
                    menu.add(Product("Cubetazo (6 cervezas",R.drawable.cubetasix,"",21.99))
                }
            }
        }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, productos: ArrayList<Product>){
            this.productos = productos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod = productos[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view,null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")
            return vista
        }
    }
}