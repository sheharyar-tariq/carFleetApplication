$('document').ready(function(){
    $('.table #editVehicleModel').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (vehicleModel,status){
            $('#vehicleModelId').val(vehicleModel.vehicleModelId);
            $('#editDetails').val(vehicleModel.details);
            $('#editDescription').val(vehicleModel.description);

        })

        $('#editModal').modal();
    });

    $('.table #deleteVehicleModel').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});