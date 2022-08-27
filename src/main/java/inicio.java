public class inicio {
    public static void main(String[] args) {

        // se instancio la clase empresa
        Empresa Miempresa =new Empresa();
        Miempresa.setNombreEmpresa("HooperWeb");
        Miempresa.setDirEmpresa("Cra 60 C # 5-20");
        Miempresa.setTelEmpresa("3003456789");
        Miempresa.setNitEmpresa("124578-2");

        System.out.println(Miempresa.getNitEmpresa());

        // se instancio la clase empleado

        Empleado    Empleado_1  = new Empleado();
        Empleado_1.setNombreEmpleado("Andres perez");
        Empleado_1.setEmpresaEmpleado("HoopersWeb");
        Empleado_1.setCorreoEmpleado("aperez@hoopersWeb.com");
        Empleado_1.setRolEmpleado("Ing de proyectos");

        System.out.println(Empleado_1.getNombreEmpleado());

        MovDinero Mov_1 =new MovDinero();
        Mov_1.setConcepto("Pago de nomina");
        Mov_1.setMonto(3689000);
        Mov_1.setUsuario("Andres");

        System.out.println(Mov_1.getMonto()+Mov_1.getConcepto()+Mov_1.getUsuario());

    }

}
//Z//
