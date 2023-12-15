import { Router } from "express";
import { createUserController } from "./useCases/CreateUser";

const router = Router();

router.get('/check', (request, respose) => {
    console.log('APi connect to get.')
    return respose.json({
        message: 'API connect.'
    });
})

router.post('/users', (request, respose) => {
    return createUserController.handle(request, respose);
});

export { router };