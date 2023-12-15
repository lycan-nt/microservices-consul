import { app } from "./app";
import { RegisterConsul } from "./discovere-client/consul.register";

app.listen(3001, () => {
    RegisterConsul.register();
    console.log("Server On!!")
});