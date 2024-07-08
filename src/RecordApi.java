public record RecordApi(String result,
                        String documentation,
                        String terms_of_use,
                        int time_last_update_unix,
                        String time_last_update_utc,
                        int time_next_update_unix,
                        String time_next_update_utc,

                        String base_code, //ACA ESTA LA BASE
                        String target_code,//Aca la moneda de cambio (Editable)
                        String conversion_rates) //ACA ESTA LA CONVERSION
{
}
